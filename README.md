# pfcMini2018

Proyecto ejemplo de integración con Mule ESB y MicroPython.

Aplicación de ejemplo para los alumnos del Master en Ingeniería informática de la Universidad de Almería.

Esta aplicación pretende dar un enfoque práctico de una aplicación que integra distintos servicios a través de una única API en este caso usando el ESB (Enterprise Service Bus) de Mule ESB.

En este ejemplo se integra con una aplicación creada para el microcontrolador ESP32 usando MicroPython; para que puedan verse aplicaciones acerca del "Internet de las cosas". Para poder utilizar el microcontrolador necesitará una [placa  de desarrollo ESP32](https://amzn.to/2ABCZN3)

**NOTA:** Para una mejor compresión y si no se dispone de la placa ESP32, se ha modificado este proyecto para hacer funcionar con una aplicación de prueba usando la página _Pythonanywhere_. Para más información del código de los backend consultar [este repositorio](https://github.com/zerasul/testflaskwsgi)

Para poder compilar este ejemplo, es necesario utilizar Maven. Esto generará las distintas librerías y compilará la aplicación de Mule que podrá usarse tanto dentro de Anypoint Studio como de forma autónoma.

```mvn install```


Para más información por favor consulte la [Wiki](https://github.com/zerasul/pfcMini2018/wiki) de este proyecto
