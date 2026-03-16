// 공통 헤더 삽입 (fetch 없이 직접 삽입 → file:// 환경에서도 동작)
function loadHeader() {
    var headerHTML = `
    <header class="header">
      <span class="header-logo">S4NGG</span>
      <div class="header-right">
        <span class="header-email">admin@example.com</span>
        <button class="btn-logout" id="logoutBtn" type="button">로그아웃</button>
      </div>
    </header>
  `;

    document.getElementById('header-wrap').innerHTML = headerHTML;

    // 로그아웃 버튼 이벤트 등록
    document.getElementById('logoutBtn').addEventListener('click', function () {
        location.href = '../pages/login.html';
    });
}

loadHeader();