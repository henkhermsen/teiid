/*
 * Copyright Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags and
 * the COPYRIGHT.txt file distributed with this work.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.teiid.common.buffer.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBlockByteBuffer {

	@Test public void testBufferSizing() {
		BlockByteBuffer bbb = new BlockByteBuffer(4, 100, 4, false);
		bbb.getByteBuffer(1);
	}
	
	@Test public void testLargeSizing() {
		BlockByteBuffer bbb = new BlockByteBuffer(30, 1000000, 13, false);
		assertEquals(8, bbb.getBuffers().length);
	}
	
}
