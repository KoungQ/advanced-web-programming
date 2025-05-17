package advancedweb.project.aiengineservice.infra.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(
        name = "geminiApiClient",
        url = "https://generativelanguage.googleapis.com/v1beta/models"
)
public interface GeminiApiClient {

    @PostMapping("/gemini-1.5-flash-latest:generateContent")
    Object generateContent(
            @RequestParam("key") String apiKey,
            @RequestBody Map<String, Object> requestBody
    );
}