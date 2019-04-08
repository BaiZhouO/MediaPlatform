$(function () {
    $('#btn_register').click(function())
    {
        if(checkId() == false || checkPassword() == false || checkPasswordRepeat() == false || checkPhone() == false || checkManager() == false){
            alert("您的表单包含无效信息，请检查并修改后再次提交！")
        }

        else
        {
            var info = {
                registerName: $("#registerName").val(),
                registerPassword: $("#registerPassword").val(),


            }
        }

        function checkId() {
            //字母数字下划线
            var regex = /^[^_][A-Za-z]*[a-z0-9_]*$/;
            var inputValue = $("#registerName").value;
            var ret = regex.test(inputValue);
            if(inputValue == ""){
                $("id-message").innerHTML = ""
            }else if(inputValue.length > 20 || inputValue.length == 1 || ret != true){
                $("id-message").innerHTML = "输入2-20位数字字母下划线";
                return false;
            }else{
                $("id-message").innerHTML = ""
            }
        }

        function checkPassword() {
            var inputValue = $("#registerPassword").value;
            if(inputValue.length == 1 || inputValue.length > 20){
                $("password-message").innerHTML = "请输入2-20个任意字符"
                return false;
            }else{
                $("password-message").innerHTML = "";
            }
        }

        function checkPasswordRepeat(){
            var password = $("#registerPassword").value;
            var repassword = $("#passwordConfirm").value;
            if (repassword == "") {
                $("repassword-message").innerHTML = ""
            } else if (repassword != password) {
                $("repassword-message").innerHTML = "请确保两次输入的密码一致"
                return false;
            } else{
                $("repassword-message").innerHTML = "";
            }
        }

        function checkPhone(){
            //只输入数字
            var number = /^1[3|4|5|8][0-9]\d{4,8}$/;
            var phone = $("shop_phone").value;
            var ret = number.test(phone);
            if(phone == ""){
                $("phone-message").innerHTML = "";
            }else if((phone.length < 11 && phone.length > 0) || (ret != true && phone.length > 0)){
                $("phone-message").innerHTML = "请确保正确输入11位手机号码";
                return false;
            }else{
                $("phone-message").innerHTML = "";
            }
        }

        function checkManager(){
            //只输入字母和汉字
            var word = /^[a-zA-Z\u4e00-\u9fa5]+$/;
            var manager = $("shop_manager").value;
            var ret = word.test(manager);
            if(ret != true && manager.length > 0){
                $("manager-message").innerHTML = "请确保您输入的内容只有汉字和字母";
                return false;
            }else{
                $("manager-message").innerHTML = "";
            }
        }

    }

})