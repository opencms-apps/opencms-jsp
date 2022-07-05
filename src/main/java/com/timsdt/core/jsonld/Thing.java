package com.timsdt.core.jsonld;

import com.timsdt.core.jsonld.text.Text;
import com.timsdt.core.jsonld.url.URL;

public class Thing extends Schema{
    @Override
    public Types getType() {
        return Types.Thing;
    }

    public URL additionalType;
    public Text alternateName;
    public Text description;
    public Text disambiguatingDescription;
    private Object identifier;
    private Object image;
    private Object mainEntityOfPage;
    public Text name;
    public Action potentialAction;
    public URL sameAs;
    private Object subjectOf;
    public URL url;


}
