package com.pluralsight.design_patterns.structural.bridge;

import java.util.List;

public interface Formatter {
    String format(String header, List<Detail> details);
}
