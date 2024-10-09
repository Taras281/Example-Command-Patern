# Example-Command-Patern
![image](https://github.com/user-attachments/assets/8a8da956-3958-4124-b980-801227a41b30)

Invoker  класс  Comander<br>
Client  класс  Main<br>
Troop класс Resiver<br>
Left, Quit классы реализующие нтерфейс Command, и владеющие(принимают в конструкторе) объект Troop<br>
Troop инкапсулируется в классы Comand типа Left и Quit<br>
Commander создает мапу с Commander<br>
в Main  создаются Troop, классы реализующие интерфейс Command, и Commander<br>
в мапу ложатся команды а затем вызываются<br>
ОЧЕНЬ интересная конструкция:<br><br>
Command right = troop::right;<br>
Command easy = troop::easy;<br>
Создаются реализации интерфейса Command самой Javой, но интерфейс имеет один метод и,Я ТАК ДУМАЮ, в этот метод передается метод указанный справа после ::
