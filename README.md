# VitoriaPadraoWeb

1-Explicações dos Padrões.

Front Controller: controlador frontal em português,esse padrão web projeta todas as
request que chegam para um pedido serão tratadas por um handler e depois para o
despacher.

Command: possui apenas o método execute, possui baixo acoplamento.

Motivação da aplicação dos Padrões: o padrão Front Controller se comporta como um
controlador tratando as request para um site e então transfere para um command.O objetivo
do front controller é fazer a solicitação através de um objeto que manipula.A interface
command possui apenas um método execute(), esse padrão diminui a quantidade de ifs que
eu poderia ter no meu código, cada classe concreta envia para um jsp diferente.

![print diagrama de classes](https://user-images.githubusercontent.com/23337586/182386394-7f4ff448-c742-4aec-91b6-b4b6ec6d24e2.PNG)
