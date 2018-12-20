import settings
import network


class Wifi:
    st = None

    def __init__(self):
        self.st = network.WLAN(settings.mode)

    def connect(self):
        if self.st.isconnected():
            print('Already Connected')
            return self.st.ifconfig()[0]

        self.st.active(True)
        self.st.connect(settings.sseid, settings.password)
        while not self.st.isconnected():
            pass
        print("Connection Successful")
        print(self.st.ifconfig())
        return self.st.ifconfig()[0]

    def create_ap(self):
        self.st.active(True)
        self.st.config(essid=settings.sseid, password=settings.password, authmode=3)
        config = self.st.ifconfig()
        print(config)
        return config[0]
