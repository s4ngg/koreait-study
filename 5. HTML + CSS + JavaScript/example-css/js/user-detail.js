// 목록으로 버튼 클릭 → 회원 목록 페이지 이동
var listBtn = document.getElementById('listBtn');

listBtn.addEventListener('click', function () {
    location.href = '../pages/user-list.html';
});