var a = document.getElementById("name");
var b = document.getElementById("btn");
b.addEventListener("click", changeColor);
a.addEventListener("mouseover", changeBG);
function changeColor(){
    a.style.color="red";
}
function changeBG(){
a.style.backgroundColor="yellow";
}
var c = document.getElementById("nam");
var d = document.getElementById("bt");
d.addEventListener("click", changeColo);
c.addEventListener("mouseover", changeBGd);
function changeColo(){
    c.style.color="blue";
}
function changeBGd(){
c.style.backgroundColor="pink";
}