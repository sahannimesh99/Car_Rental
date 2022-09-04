package lk.bolton.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Sahan Nimesha on 2022 - Sep
 * In IntelliJ IDEA
 */

@Configuration
@Import({JpaConfig.class})
public class WebAppRootConfig {
}
