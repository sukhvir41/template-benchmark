package com.mitchellbosecke.benchmark;

import com.github.sukhvir41.core.settings.SettingOptions;
import com.github.sukhvir41.core.settings.SettingsManager;
import com.github.sukhvir41.template.HtmlTemplateLoader;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Setup;

import java.nio.file.Paths;
import java.util.Map;

public class HtmlTemplate extends BaseBenchmark {

    private com.github.sukhvir41.template.HtmlTemplate htmlTemplate;

    @Setup
    public void setup() throws Exception {
        //System.out.println(this.getClass().getClassLoader().getResource("templates/stocks.HtTemplate.html").toURI());
        htmlTemplate = HtmlTemplateLoader.load(
                Paths.get("D:\\sharedFolder\\template-benchmark\\stocks.HtTemplate.html"),
                //Paths.get(this.getClass().getClassLoader().getResource("templates/stocks.HtTemplate.html").toURI()),
                SettingsManager.load(Map.of(SettingOptions.SUPPRESS_EXCEPTIONS, false))
        );
    }

    @Benchmark
    public String benchmark() {
        return htmlTemplate.render(getContext());
    }
}
