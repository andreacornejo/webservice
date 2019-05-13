# ejemplo-web-service-java

ejemplo de web service con java, son dos proyectos diferentes, 
uno WSBanco que actua de servio, y WSCliente que consume el servico
 que simula la cotizacion de una moneda por fecha, en donde el banco tiene dos servicios uno setCotizacion, que guarda en base de datos la fecha y valor, el segundo metodo es getCotizacion, donde dada una fecha con el formato igual al mismo ingresado a guardar, devuelve el valor de cotizacion para esa fecha,
 ####Nota
 La variable fecha es un string tanto como en el servico como en base de datos de manera tal que, el formato en el que se ingrese la fecha a guardar debera ser el mismo con el que este se manda a buscar
### Para probar el ejemplo
#### reanimar la base de dados:
 el archivo lleba el nombre de dbBanco.sql
#### ejecutar el Cliente
El en el proyecto existe un archivo con el nombre de viewClient.jsp en el achivo web



