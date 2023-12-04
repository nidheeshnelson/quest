document.write("Inbuilt functions  <br> document.write(), alert(), etc <br>");
document.write("User functions  <br>");
function nidheeshnelson(){
document.write("I am Nidheesh Nelson <br>");
}
nidheeshnelson();
nidheeshnelson();

function me(name){
    document.write("I am "+name +"<br>");
}
me("nidheesh");
me(25);

//addition

function add(n1, n2){
    document.write(n1+n2 +"<br>");
}
add(25,50);

// Return function

function retur(s1, s2){
return s1+s2;
}
var s = retur(36,65);
document.write(s);