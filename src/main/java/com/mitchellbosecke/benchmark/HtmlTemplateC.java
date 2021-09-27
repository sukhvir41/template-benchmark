package com.mitchellbosecke.benchmark;

import com.mitchellbosecke.benchmark.model.Stock;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.Map;

public class HtmlTemplateC extends com.github.sukhvir41.template.HtTemplate {

    private static final String PLAIN_HTML_0 = "<!DOCTYPE html>\n<html>\n\t<head>\n\t\t<title>\n\t\t\tStock Prices\n\t\t</title>\n\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n\t\t<meta http -equiv=\"Content-Style-Type\" content=\"text/css\"/>\n\t\t<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\"/>\n\t\t<link rel=\"shortcut icon\" href=\"/images/favicon.ico\"/>\n\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/style.css\" media=\"all\"/>\n\t\t<script type=\"text/javascript\" src=\"/js/util.js\">\n\t\t</script>\n\t\t<style type=\"text/css\">\n\t\t\t/*<![CDATA[*/\n\t\t\tbody {\n\t\t\tcolor: #333333;\n\t\t\tline-height: 150%;\n\t\t\t}\n\t\t\tthead {\n\t\t\tfont-weight: bold;\n\t\t\tbackground-color: #CCCCCC;\n\t\t\t}\n\t\t\t.odd {\n\t\t\tbackground-color: #FFCCCC;\n\t\t\t}\n\t\t\t.even {\n\t\t\tbackground-color: #CCCCFF;\n\t\t\t}\n\t\t\t.minus {\n\t\t\tcolor: #FF0000;\n\t\t\t}\n\t\t\t/*]]>*/\n\t\t</style>\n\t</head>\n\t<body>\n\t\t<h1>\n\t\t\tStock Prices\n\t\t</h1>\n\t\t<table>\n\t\t\t<thead>\n\t\t\t\t<tr>\n\t\t\t\t\t<th>\n\t\t\t\t\t\t#\n\t\t\t\t\t</th>\n\t\t\t\t\t<th>\n\t\t\t\t\t\tsymbol\n\t\t\t\t\t</th>\n\t\t\t\t\t<th>\n\t\t\t\t\t\tname\n\t\t\t\t\t</th>\n\t\t\t\t\t<th>\n\t\t\t\t\t\tprice\n\t\t\t\t\t</th>\n\t\t\t\t\t<th>\n\t\t\t\t\t\tchange\n\t\t\t\t\t</th>\n\t\t\t\t\t<th >\n\t\t\t\t\t\tratio\n\t\t\t\t\t</th>\n\t\t\t\t</tr>\n\t\t\t</thead>\n\t\t\t<tbody>\n";
    private static final String PLAIN_HTML_1 = "\t\t\t\t<tr class = \"";
    private static final String PLAIN_HTML_2 = "\" >\n\t\t\t\t\t<td>\n\t\t\t\t\t\t";
    private static final String PLAIN_HTML_3 = "\n\t\t\t\t\t</td>\n\t\t\t\t\t<td>\n\t\t\t\t\t\t<a href = \"";
    private static final String PLAIN_HTML_4 = "\" >\n\t\t\t\t\t\t\t";
    private static final String PLAIN_HTML_5 = "\n\t\t\t\t\t\t</a>\n\t\t\t\t\t</td>\n\t\t\t\t\t<td>\n\t\t\t\t\t\t<a href = \"";
    private static final String PLAIN_HTML_6 = "\" >\n\t\t\t\t\t\t\t";
    private static final String PLAIN_HTML_7 = "\n\t\t\t\t\t\t</a>\n\t\t\t\t\t</td>\n\t\t\t\t\t<td>\n\t\t\t\t\t\t<strong>\n\t\t\t\t\t\t\t";
    private static final String PLAIN_HTML_8 = "\n\t\t\t\t\t\t</strong>\n\t\t\t\t\t</td>\n";
    private static final String PLAIN_HTML_9 = "\t\t\t\t\t<td class=\"minus\">\n\t\t\t\t\t\t";
    private static final String PLAIN_HTML_10 = "\n\t\t\t\t\t</td>\n";
    private static final String PLAIN_HTML_11 = "\t\t\t\t\t<td>\n\t\t\t\t\t\t";
    private static final String PLAIN_HTML_12 = "\n\t\t\t\t\t</td>\n";
    private static final String PLAIN_HTML_13 = "\t\t\t\t\t<td class=\"minus\">\n\t\t\t\t\t\t";
    private static final String PLAIN_HTML_14 = "\n\t\t\t\t\t</td>\n";
    private static final String PLAIN_HTML_15 = "\t\t\t\t\t<td>\n\t\t\t\t\t\t";
    private static final String PLAIN_HTML_16 = "\n\t\t\t\t\t</td>\n";
    private static final String PLAIN_HTML_17 = "\t\t\t\t</tr>\n";
    private static final String PLAIN_HTML_18 = "\t\t\t</tbody>\n\t\t</table>\n\t</body>\n</html>\n";

    public static HtmlTemplateC getInstance() {
        return new HtmlTemplateC();
    }

    @Override
    public int writerInitialSize() {
        return 4074;
    }

    private List<Stock> items;

    private List<Stock> items() {
        return items;
    }

    public HtmlTemplateC items(List<Stock> items) {
        this.items = items;
        return this;
    }

    @Override
    public void renderImpl(Writer writer8111) throws IOException {
        writer8111.write(PLAIN_HTML_0);
        forEach(items(), (index, item) -> {
            writer8111.write(PLAIN_HTML_1);
            writer8111.write(content(((index + 1) % 2 == 0) ? "even" : "odd"));
            writer8111.write(PLAIN_HTML_2);
            writer8111.write(content(index + 1));
            writer8111.write(PLAIN_HTML_3);
            writer8111.write(content("/stocks/" + item.getSymbol()));
            writer8111.write(PLAIN_HTML_4);
            writer8111.write(content(item.getSymbol()));
            writer8111.write(PLAIN_HTML_5);
            writer8111.write(content(item.getUrl()));
            writer8111.write(PLAIN_HTML_6);
            writer8111.write(content(item.getName()));
            writer8111.write(PLAIN_HTML_7);
            writer8111.write(content(item.getPrice()));
            writer8111.write(PLAIN_HTML_8);
            if (item.getChange() < 0) {
                writer8111.write(PLAIN_HTML_9);
                writer8111.write(content(item.getChange()));
                writer8111.write(PLAIN_HTML_10);
            } else {
                writer8111.write(PLAIN_HTML_11);
                writer8111.write(content(item.getChange()));
                writer8111.write(PLAIN_HTML_12);
            }
            if (item.getRatio() < 0) {
                writer8111.write(PLAIN_HTML_13);
                writer8111.write(content(item.getRatio()));
                writer8111.write(PLAIN_HTML_14);
            } else {
                writer8111.write(PLAIN_HTML_15);
                writer8111.write(content(item.getRatio()));
                writer8111.write(PLAIN_HTML_16);
            }
            writer8111.write(PLAIN_HTML_17);
        });
        writer8111.write(PLAIN_HTML_18);

    }

}
