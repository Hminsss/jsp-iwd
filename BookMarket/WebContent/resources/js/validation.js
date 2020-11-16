function CheckAddBook(){
	
	var bookId = document.getElementById("bookId");
	var name = document.getElementById("name");
	var unitPrice = document.getElementById("unitPrice");
	var unitInStock = document.getElementById("unitInStock");
	
	if(!check(/^ISBN[0-9]{1,8}$/, bookId,"[도서코드]\nISBN과 숫자를 조합하여 5~12자까지 입력하세요 첫글자는 반드시 ISBN으로 시작하세요."))
		return false;
	
	if(name.value.length<4 || name.value.length>12){
		alert("[도서제목]\n최소 4자에서 최대 12자까지 입력하세요.");
		name.select();
		name.focus();
		return false;
	}
	
	if(unitPrice.value.length == 0|| isNaN(unitPrice.value)){
		alert("[도서가격]\n숫자만 입력하세요.");
		unitPrice.select();
		unitPrice.focus();
		return false;
	
	}
	if(unitPrice.value < 0){
		alert("[도서가격]\n음수는 입력할 수 없습니다.");
		unitPrice.select();
		unitPrice.focus();
		return false;
	
	}
	
	if(isNaN(unitInStock.value)){
		alert("[재고 수]\n숫자만 입력하세요.");
		unitInStock.select();
		unitInStock.focus();
		return false;
	}
		
	function check(regExp, e, msg){
	
		if(regExp.test(e.value)){
			return true;
			}
		alert(msg);
		e.select();
		e.focus();
		return false;
	}
		
		document.newBook.submit();
	
}