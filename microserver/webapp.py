import picoweb
from wifi import Wifi
from machine import Pin

wf = Wifi()
ip = wf.create_ap()
app = picoweb.WebApp('Test App')
pin = Pin(23, Pin.OUT)


@app.route('/')
def index(req, resp):
    yield from picoweb.start_response(resp)
    yield from resp.awrite("Servidor de Prueba")


@app.route('/clients')
def get_clients(req, resp):
    yield from picoweb.start_response(resp, content_type='application/json')
    f = open('clients.json')
    tempcontent = f.readlines()
    strcom = ''
    for line in tempcontent:
        strcom = strcom + line
    yield from resp.awrite(strcom)


@app.route('/products')
def get_products(req, resp):
    yield from picoweb.start_response(resp, content_type='application/json')
    f = open('products.json')
    tempcontent = f.readlines()
    strcom = ''
    for line in tempcontent:
        strcom = strcom + line
    yield from resp.awrite(strcom)


@app.route('/sales')
def create_sale(req, resp):
    if req.method == 'POST':
        yield from req.read_form_data()
    else:
        yield from picoweb.http_error(resp, 405)

    yield from picoweb.start_response(resp, content_type='application/json')
    yield from resp.awrite('{"status":"OK"}')


@app.route('/on')
def turn_on(req, resp):
    pin.value(1)
    yield from picoweb.start_response(resp, content_type='application/json')
    yield from resp.awrite('{"light":"ON"}')


@app.route('/off')
def turn_off(req, resp):
    pin.value(0)
    yield from picoweb.start_response(resp, content_type='application/json')
    yield from resp.awrite('{"light":"Off"}')


app.run(debug=-1, host=ip)
