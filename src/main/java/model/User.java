package model;

import org.apache.commons.lang3.RandomStringUtils;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {

    @Builder.Default
    private String name = RandomStringUtils.randomAlphabetic(10);

    @Builder.Default
    private String password = RandomStringUtils.random(10);
}
