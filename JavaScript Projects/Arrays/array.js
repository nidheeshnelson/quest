// arrays
var animal = ["tiger", "cat", "dog", "elephent"];
document.write(animal +"<br>"+animal[2] +"<br>");
animal[0]="tiger2";
document.write(animal +"<br>"+animal[0] +"<br>");

//Length of array

var x = animal.length;
document.write(x+"<br>");
for(i=0;i<5;i++)
{
document.write(animal[i]+"<br>");
}

//Adding new

animal[5]="tiger";
for(i=0;i<5;i++)
{
document.write(animal[i]+"<br>");
}

//push

animal.push("fox");
for(i=0;i<7;i++)
{
document.write(animal[i]+"<br>");
}

//delete first value
//shift method

animal.shift();
for(i=0;i<6;i++)
{
document.write(animal[i]+"<br>");
}

//delete last value
//pop method

animal.pop();
for(i=0;i<5;i++)
{
document.write(animal[i]+"<br>");
}

//delete decided value
//splice method

animal.splice(3,1);
for(i=0;i<4;i++)
{
document.write(animal[i]+"<br>");
}

//sort

animal.sort();
for(i=0;i<4;i++)
{
document.write(animal[i]+"<br>");
}