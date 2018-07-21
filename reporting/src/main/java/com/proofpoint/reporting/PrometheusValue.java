/*
 * Copyright 2018 Proofpoint, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.proofpoint.reporting;

import javax.annotation.Nullable;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Map.Entry;

interface PrometheusValue
{
    void writeMetric(BufferedWriter writer, String name, Iterable<Entry<String, String>> tags, @Nullable Long timestamp)
            throws IOException;
}