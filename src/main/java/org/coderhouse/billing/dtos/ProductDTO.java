package org.coderhouse.billing.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.coderhouse.billing.models.Product;

@NoArgsConstructor //generate constructor without any arguments
@Getter //generate all getters for all properties
public class ProductDTO {
    @NonNull
    @Schema(description = "ID of the product", required = true, example = "1")
    private Integer id;

    @NonNull
    @Schema(description = "Name of the product", required = true, example = "Electric Scooter")
    private String name;

    @NonNull
    @Schema(description = "Stock of the product", required = true, example = "500")
    private Integer stock;

    @NonNull
    @Schema(description = "Description of the product", required = true, example = "Sunra Spy Racing 1000w Litio")
    private String description;

    @NonNull
    @Schema(description = "Price of the product", required = true, example = "1690000")
    private Long price;

    public ProductDTO(Product product){
        this.id = product.getId();

        this.name = product.getName();

        this.stock = product.getStock();

        this.description = product.getDescription();

        this.price = product.getPrice();

    }


}
