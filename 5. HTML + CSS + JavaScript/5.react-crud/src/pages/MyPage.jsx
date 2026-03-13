import { Link } from "react-router-dom";
import Header from "../components/Header";
import { useMemberHook } from "../hooks/useMemberHook";

function MyPage() {
    const {
        userName, setUserName,
        email, setEmail,
        currentPassword, setCurrentPassword,
        newPassword, setNewPassword,
        passwordCheck, setPasswordCheck,
        memberDTO, isLoading,
        handleUpdateSubmit, handlePasswordSubmit
    } = useMemberHook();

    if (isLoading) return <div>로딩중...</div>

    return (
        <>
            <Header />
            <div className="container">
                <h1 style={{ marginBottom: "2rem" }}>회원정보</h1>
                <div className="profile-container">
                    <div className="profile-sidebar">
                        <div className="profile-avatar">👤</div>
                        <div style={{ textAlign: "center" }}>
                            <h3 style={{ marginBottom: "0.5rem" }}>{memberDTO?.userName}</h3>
                            <p style={{ color: "var(--text-secondary)", fontSize: "0.9rem" }}>
                                {memberDTO?.email}
                            </p>
                        </div>
                    </div>
                    <div className="profile-main">
                        <div className="profile-section">
                            <h3>기본 정보</h3>
                            <form onSubmit={handleUpdateSubmit}>
                                <div className="form-group">
                                    <label>이름</label>
                                    <input
                                        type="text"
                                        required
                                        value={userName}
                                        onChange={(e) => setUserName(e.target.value)}
                                    />
                                </div>
                                <div className="form-group">
                                    <label>아이디</label>
                                    <input
                                        type="text"
                                        value={memberDTO?.userId || ''}
                                        disabled
                                        onChange={() => {}}
                                    />
                                </div>
                                <div className="form-group">
                                    <label>이메일</label>
                                    <input
                                        type="email"
                                        required
                                        value={email}
                                        onChange={(e) => setEmail(e.target.value)}
                                    />
                                </div>
                                <button type="submit" className="btn btn-primary">
                                    저장
                                </button>
                            </form>
                        </div>
                        <div className="profile-section">
                            <h3>비밀번호 변경</h3>
                            <form onSubmit={handlePasswordSubmit}>
                                <div className="form-group">
                                    <label>현재 비밀번호</label>
                                    <input
                                        type="password"
                                        placeholder="현재 비밀번호를 입력하세요"
                                        required
                                        value={currentPassword}
                                        onChange={(e) => setCurrentPassword(e.target.value)}
                                    />
                                </div>
                                <div className="form-group">
                                    <label>새 비밀번호</label>
                                    <input
                                        type="password"
                                        placeholder="새 비밀번호를 입력하세요"
                                        required
                                        value={newPassword}
                                        onChange={(e) => setNewPassword(e.target.value)}
                                    />
                                </div>
                                <div className="form-group">
                                    <label>비밀번호 확인</label>
                                    <input
                                        type="password"
                                        placeholder="비밀번호를 다시 입력하세요"
                                        required
                                        value={passwordCheck}
                                        onChange={(e) => setPasswordCheck(e.target.value)}
                                    />
                                </div>
                                <button type="submit" className="btn btn-primary">
                                    비밀번호 변경
                                </button>
                            </form>
                        </div>
                        <div className="profile-section">
                            <Link
                                to="/login"
                                className="btn btn-secondary"
                                style={{
                                    textDecoration: "none",
                                    display: "inline-block",
                                    marginTop: "2rem"
                                }}
                            >
                                로그아웃
                            </Link>
                        </div>
                    </div>
                </div>
            </div>
        </>
    );
}

export default MyPage;