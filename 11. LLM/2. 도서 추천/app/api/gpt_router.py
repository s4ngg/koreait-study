from fastapi import APIRouter
from app.schemas.gpt_schema import GPTRequest, GPTResponse
from app.service.gpt_service import GPTService

router = APIRouter(prefix="/gpt", tags=["GPT"])
service = GPTService()

@router.post("/generate", response_model=GPTResponse)
def generate_text(req: GPTRequest):
    result = service.generate_text(
        genre=req.genre,
        purpose=req.purpose,
        level=req.level,
        description=req.description
    )
    return GPTResponse(result=result)