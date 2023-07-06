package com.mulesoft.javasapppbomsapi.model;

import java.util.Date;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class PingResponse {
    private String status;
    private String apiName;
    private String apiVersion;
    private Date timestamp;
}