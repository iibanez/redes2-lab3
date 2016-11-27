# Lab 3 de sistemas de comunicación

# Compilación
```sh
$ javac Cliente.java ImplementacionRMI.java InterfaceRMI.java Servidor.java
$ rmic ImplementacionRMI
```
# Ejecucución
Se deben abrir tres terminales y ejecutar

#### Terminal 1
```sh
$ rmiregistry
```
#### Terminal 2
```sh
$ java Servidor
```
#### Terminal 3
```sh
$ java Cliente
```
En la terminal del cliente debe ingresar el nombre de la persona.

[//]: # ( http://dillinger.io/, https://stackedit.io/editor)