package pe.com.isesystem.gpservice.dto;

import lombok.Data;

@Data
public class PaginationRequestDto {
    private int page;
    private int size;
    private String sort;
    private String direction;
}
