package io.spbx.util.prima.extern.hppc;

import org.jetbrains.annotations.NotNull;

public class PrimaRuntimeRequirement {
    public static void verify(@NotNull String className, @NotNull String requirementName) {
        try {
            Class.forName(className);
        } catch (ClassNotFoundException ignore) {
            throw new UnsupportedOperationException("Runtime requirement is missing: " + requirementName);
        }
    }

    public static void verify(@NotNull String className) {
        verify(className, className);
    }
}
