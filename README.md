# pfcMini2018

Proyecto ejemplo de integración con Mule ESB y MicroPython.

Aplicación de ejemplo para los alumnos del Master en Ingeniería informática de la Universidad de Almería.

Esta aplicación pretende dar un enfoque práctico de una aplicación que integra distintos servicios a través de una única API en este caso usando el ESB (Enterprise Service Bus) de Mule ESB.

En este ejemplo se integra con una aplicación creada para el microcontrolador ESP32 usando MicroPython; para que puedan verse aplicaciones acerca del "Internet de las cosas".

Para poder compilar este ejemplo, es necesario utilizar Maven. Esto generará las distintas librerías y compilará la aplicación de Mule que podrá usarse tanto dentro de Anypoint Studio como de forma autónoma.

```mvn install```

