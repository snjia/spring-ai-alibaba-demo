package com.sn.ai.agent2;

import org.springframework.ai.chat.model.ToolContext;
import org.springframework.ai.tool.annotation.ToolParam;
import java.util.function.BiFunction;

// 天气查询工具
public class WeatherForLocationTool implements BiFunction<String, ToolContext, String> {
    @Override
    public String apply(
            @ToolParam(description = "The city name") String city,
            ToolContext toolContext) {
        return "It's always sunny in " + city + "!";
    }
}
