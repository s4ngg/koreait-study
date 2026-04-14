from pydantic import BaseModel

class GPTRequest(BaseModel):
    genre: str
    purpose: str
    level: str
    description: str = ""

class GPTResponse(BaseModel):
    result: str