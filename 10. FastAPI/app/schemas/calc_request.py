# <CalcRequest> schemas
# 파일명 : calc_request / 클래스명 : CalcRequest
# 1. 총 3개의 타입을 검사
#   - a, b : int 타입이어야 한다. (사용자가 입력한 숫자 2개)
#   - op : str 타입이어야 한다. (사용자가 입력한 연산자, "+", "-", "*")
from pydantic import BaseModel

class CalcRequest(BaseModel):
    a: int
    b: int
    op: str