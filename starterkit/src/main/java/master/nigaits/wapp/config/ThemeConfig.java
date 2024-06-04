package master.nigaits.wapp.config;

import master.nigaits.wapp.libs.KTTheme;
import master.nigaits.wapp.libs.config.KTThemeBaseConfig;
import master.nigaits.wapp.libs.config.KTIconsBaseSettings;
import master.nigaits.wapp.libs.config.KTThemeSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

@Configuration
public class ThemeConfig {
    @Bean("theme")
    @RequestScope
    public KTTheme theme(){
        return new KTTheme();
    }

    @Bean("settings")
    public KTThemeBaseConfig settings() {
        KTThemeSettings settings = new KTThemeSettings();
        return settings.config;
    }

    @Bean("iconsSettings")
    public KTIconsBaseSettings iconsSettings(){
       return new KTIconsBaseSettings();
    }
}
