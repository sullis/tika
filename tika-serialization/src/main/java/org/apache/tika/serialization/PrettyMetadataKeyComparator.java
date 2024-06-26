/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.tika.serialization;

import org.apache.tika.metadata.TikaCoreProperties;

public class PrettyMetadataKeyComparator implements java.util.Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if (s1 == null) {
            return 1;
        } else if (s2 == null) {
            return -1;
        }

        if (s1.equals(TikaCoreProperties.TIKA_CONTENT.getName())) {
            if (s2.equals(TikaCoreProperties.TIKA_CONTENT.getName())) {
                return 0;
            }
            return 2;
        } else if (s2.equals(TikaCoreProperties.TIKA_CONTENT.getName())) {
            return -2;
        }
        //do we want to lowercase?
        return s1.compareTo(s2);
    }
}

