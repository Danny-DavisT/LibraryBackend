function opencontent(evt, pagecontent ) {
    var i, tabcontent, tablinks;
    alert("hello");
    tabcontent= document.getElementsByClassName("tabcontent");
    for( i=0; i<tabcontent.length; i++){
        tabcontent[i].style.dispaly="none";
    }
    tablinks=document.getElementsByClassName("tablinks");
    for(i=0;i<tablinks.length;i++){
        tablinks[i].className= tablinks[i].className.replace("active","");
    }
    document.getElementById(pagecontent).style.display="block";
    evt.currentTarget.className+="actvie";
}
document.getElementById("dash-b").click();