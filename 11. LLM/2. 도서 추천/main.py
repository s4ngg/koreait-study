from fastapi import FastAPI
from starlette.middleware.cors import CORSMiddleware
from app.api import gpt_router

app = FastAPI(
    title="FastAPI 도서 추천 서비스",
    version="1.0.0"
)

origins = [
    "http://localhost:5173",
    "http://127.0.0.1:5173",
]

app.add_middleware(
    CORSMiddleware,
    allow_origins=origins,
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)

app.include_router(gpt_router.router)

@app.get("/")
def read_root():
    return {"message": "도서 추천 API 서버가 실행중입니다."}