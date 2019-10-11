# Breaking-Inheritance
I kept getting some confusion regarding inheritance and the <b>private-protected</b> access in Java OOP. I tweaked here and there in this code to see how things play out.<br>

What I have come to understand-
<ul>
  <li>A java source file can't include more than one public class</li>
  <li>The source file name and the class containing the main() must be the same</li>
  <li>A public class and the source file that contains it, both must have the same name</li>
  <li>If there are multiple main() in different classes, then the class with the same name as its source file will be the driving main()</li>
  <li>Private properties can't be directly accessed outside its class, even with its own class object. It can only be directly accessed withing its class boundary</li>
  <li>
    Any parent class type variable can hold its child class type object. But not vice versa. Suppose if A is parent class and B is child class -
    <ul>
      <li>A obj = new B() - is valid</li>
      <li>B obj = new A() - is invalid</li>
     </ul>
  </li>
  <li>Here obj can only have access to the properties of A. It wouldn't have access to any property in B</li>
  <li>If there is some method in B that overrides one in A, then when obj calls that method then the one in B is invoked</li>
  <li>Child class has direct access to its parent class's protected properties; actually has access to all its non-private properties</li>
  <li>Child class object will override parent class's attributes of the same name</li>
</ul>

Do correct me if I am wrong.
