from openai import OpenAI
from app.core.config import settings
from app.utils.prompt_builder import build_prompt

client = OpenAI(api_key=settings.OPENAI_API_KEY)

class GPTService:
    def generate_text(self, genre: str, purpose: str, level: str, description: str):
        final_prompt = build_prompt(genre, purpose, level, description)

        response = client.chat.completions.create(
            model="gpt-5.4-nano",
            messages=final_prompt,
            max_completion_tokens=20000,
            temperature=0.3
        )

        return response.choices[0].message.content