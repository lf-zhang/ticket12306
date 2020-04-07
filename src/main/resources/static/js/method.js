/*根据id获取对象*/
function getId(str) {
    return document.getElementById(str);
}
 
var prov = getId('prov');
var prov1 = getId('prov1');

/*自动加载省份列表*/
(function showProv() {
    var len = provice.length;
    for (var i = 0; i < len; i++) {
        var provOpt = document.createElement('option');
        provOpt.innerText = provice[i]['name'];
        provOpt.value = provice[i]['name'];
        prov.appendChild(provOpt);
    }
})();
(function showProv1() {
    var len = provice.length;
    for (var i = 0; i < len; i++) {
        var provOpt = document.createElement('option');
        provOpt.innerText = provice[i]['name'];
        provOpt.value = provice[i]['name'];
        prov1.appendChild(provOpt);
    }
})();
 
