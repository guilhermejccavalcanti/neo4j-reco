/*
 * Copyright (c) 2015 GraphAware
 *
 * This file is part of GraphAware.
 *
 * GraphAware is free software: you can redistribute it and/or modify it under the terms of
 * the GNU General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details. You should have received a copy of
 * the GNU General Public License along with this program.  If not, see
 * <http://www.gnu.org/licenses/>.
 */

package com.graphaware.reco.generic.transform;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for {@link ParetoScoreTransformer}.
 */
public class ParetoScoreTransformerTest {

    @Test
    public void verifyTransform() {
        ParetoScoreTransformer transformer = new ParetoScoreTransformer(100, 10);

        assertEquals(0, transformer.transform(null, 0));
        assertEquals(15, transformer.transform(null, 1));
        assertEquals(28, transformer.transform(null, 2));
        assertEquals(38, transformer.transform(null, 3));
        assertEquals(55, transformer.transform(null, 5));
        assertEquals(80, transformer.transform(null, 10));
        assertEquals(96, transformer.transform(null, 20));
        assertEquals(100, transformer.transform(null, 50));
        assertEquals(100, transformer.transform(null, 100));
        assertEquals(100, transformer.transform(null, 10000));
    }
}
