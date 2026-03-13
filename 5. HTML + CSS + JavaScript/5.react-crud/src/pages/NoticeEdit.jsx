import { useNoticeEditHook } from "../hooks/useNoticeEditHook";
import { Link } from "react-router-dom";
import Header from "../components/Header";

function NoticeEdit() {
    const {id,
            category,
            title,
            boardDTO,
            selectedFiles,
            imagePreview,
            quillRef,
            handleSubmit,
            setCategory,
            setTitle,
            handleImageChange,
            isLoading,
            isError} = useNoticeEditHook();

    if (isLoading) return <div>로딩 중...</div>
    if (isError) return <div>에러 발생!</div>


    return (
        <>
            <Header />
            <div className="container">
                <h1 style={{ marginBottom: "2rem" }}>공지사항 수정</h1>
                <div className="form-card" style={{ maxWidth: 800 }}>
                    <form onSubmit={handleSubmit}>
                        <div className="form-group">
                            <label>분류</label>
                            <select
                                id="announcementCategory"
                                value={category}
                                onChange={(e) => setCategory(e.target.value)}
                                style={{
                                    width: "100%",
                                    padding: "0.75rem",
                                    border: "1px solid var(--border)",
                                    borderRadius: "0.5rem"
                                }}
                            >
                                <option value="공지">공지</option>
                                <option value="점검">점검</option>
                                <option value="이벤트">이벤트</option>
                            </select>
                        </div>
                        <div className="form-group">
                            <label>제목</label>
                            <input
                                type="text"
                                id="announcementTitle"
                                placeholder="공지사항 제목을 입력하세요"
                                required=""
                                value={title}
                                onChange={(e) => setTitle(e.target.value)}
                            />
                        </div>
                        <div className="form-group">
                            <label>내용</label>
                            <div id="noticeEditor" className="editor-container" />
                        </div>
                        <div className="form-group">
                            <label>이미지 업로드</label>
                            <input type="file" id="announcementImage" accept="image/*"
                                        onChange={handleImageChange}/>
                            <div id="imagePreview" style={{ marginTop: "1rem" }} />
                        </div>
                        <div className="form-actions" style={{ textAlign: "center" }}>
                            <button type="submit" className="btn btn-primary">
                                수정
                            </button>
                            <Link
                                to="/notice/list"
                                className="btn btn-secondary"
                                style={{ textDecoration: "none" }}
                            >
                                취소
                            </Link>
                        </div>
                    </form>
                </div>
            </div>

        </>
    )
}

export default NoticeEdit;