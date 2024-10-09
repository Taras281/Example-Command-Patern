# Example-Command-Patern
![image](https://github.com/user-attachments/assets/8a8da956-3958-4124-b980-801227a41b30)

Invoker  класс  Comander
Client  класс  Main
Troop класс Resiver
Left, Quit классы реализующие нтерфейс Command, и владеющие(принимают в конструкторе) объект Troop
Troop инкапсулируется в классы Comand типа Left и Quit
Commander создает мапу с Commander
в Main  создаются Troop, классы реализующие интерфейс Command, и Commander
в мапу ложатся команды а затем вызываются
ОЧЕНЬ интересная конструкция:
Command right = troop::right;
Command easy = troop::easy;
Создаются реализации интерфейса Command самой Javой, но интерфейс имеет один метод и,Я ТАК ДУМАЮ, в этот метод передается метод указанный справа после ::
