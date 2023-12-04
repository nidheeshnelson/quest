var heading = document.createElement("h1");
function create(){
    heading.innerHTML="Hello Braji";
    document.body.appendChild(heading);
}
function remove(){
    heading.remove();
}