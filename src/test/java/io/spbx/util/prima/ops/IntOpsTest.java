package io.spbx.util.prima.ops;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntOpsTest {
    @Test
    public void range_of_one() {
        assertThat(IntOps.range(0)).asList().isEmpty();
        assertThat(IntOps.range(1)).asList().containsExactly(0).inOrder();
        assertThat(IntOps.range(2)).asList().containsExactly(0, 1).inOrder();
        assertThat(IntOps.range(3)).asList().containsExactly(0, 1, 2).inOrder();

        assertThat(IntOps.range(-1)).asList().containsExactly(0).inOrder();
        assertThat(IntOps.range(-2)).asList().containsExactly(0, -1).inOrder();
        assertThat(IntOps.range(-3)).asList().containsExactly(0, -1, -2).inOrder();
    }

    @Test
    public void range_of_two() {
        assertThat(IntOps.range(0, 0)).asList().isEmpty();
        assertThat(IntOps.range(0, 1)).asList().containsExactly(0).inOrder();
        assertThat(IntOps.range(0, 2)).asList().containsExactly(0, 1).inOrder();
        assertThat(IntOps.range(0, 3)).asList().containsExactly(0, 1, 2).inOrder();

        assertThat(IntOps.range(1, 0)).asList().containsExactly(1).inOrder();
        assertThat(IntOps.range(2, 0)).asList().containsExactly(2, 1).inOrder();
        assertThat(IntOps.range(3, 0)).asList().containsExactly(3, 2, 1).inOrder();
    }

    @Test
    public void firstNonNegative_of_two() {
        assertThat(IntOps.firstNonNegative(1, 2)).isEqualTo(1);
        assertThat(IntOps.firstNonNegative(0, 1)).isEqualTo(0);
        assertThat(IntOps.firstNonNegative(0, -1)).isEqualTo(0);
        assertThat(IntOps.firstNonNegative(-1, 0)).isEqualTo(0);
        assertThrows(IllegalArgumentException.class, () -> IntOps.firstNonNegative(-1, -2));
    }

    @Test
    public void firstNonNegative_of_three() {
        assertThat(IntOps.firstNonNegative(1, 2, 3)).isEqualTo(1);
        assertThat(IntOps.firstNonNegative(0, 1, 2)).isEqualTo(0);
        assertThat(IntOps.firstNonNegative(0, -1, -2)).isEqualTo(0);
        assertThat(IntOps.firstNonNegative(-1, 0, 1)).isEqualTo(0);
        assertThat(IntOps.firstNonNegative(-1, 0, -2)).isEqualTo(0);
        assertThat(IntOps.firstNonNegative(-1, -2, 0)).isEqualTo(0);
        assertThrows(IllegalArgumentException.class, () -> IntOps.firstNonNegative(-1, -2, -1));
    }

    @Test
    public void firstNonNegative_of_vararg() {
        assertThat(IntOps.firstNonNegative(1, 2, 3, 4, 5)).isEqualTo(1);
        assertThat(IntOps.firstNonNegative(0, 1, 2, 0, 1)).isEqualTo(0);
        assertThat(IntOps.firstNonNegative(0, -1, -2, -3, -4)).isEqualTo(0);
        assertThat(IntOps.firstNonNegative(-1, 0, -2, -3, -4)).isEqualTo(0);
        assertThat(IntOps.firstNonNegative(-1, -2, 0, -3, -4)).isEqualTo(0);
        assertThat(IntOps.firstNonNegative(-1, -2, -3, 0, -4)).isEqualTo(0);
        assertThat(IntOps.firstNonNegative(-1, -2, -3, -4, 0)).isEqualTo(0);
        assertThrows(IllegalArgumentException.class, () -> IntOps.firstNonNegative(-1, -2, -1, -2, -3));
    }

    @Test
    public void requirePositive_simple() {
        assertThat(IntOps.requirePositive(1)).isEqualTo(1);
        assertThat(IntOps.requirePositive(Integer.MAX_VALUE)).isEqualTo(Integer.MAX_VALUE);
        assertThrows(IllegalArgumentException.class, () -> IntOps.requirePositive(0));
        assertThrows(IllegalArgumentException.class, () -> IntOps.requirePositive(-1));
    }

    @Test
    public void requireNonNegative_simple() {
        assertThat(IntOps.requireNonNegative(0)).isEqualTo(0);
        assertThat(IntOps.requireNonNegative(1)).isEqualTo(1);
        assertThat(IntOps.requireNonNegative(Integer.MAX_VALUE)).isEqualTo(Integer.MAX_VALUE);
        assertThrows(IllegalArgumentException.class, () -> IntOps.requirePositive(-1));
    }
}
