/*
 * Copyright 2013 Proofpoint, Inc.
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

import com.google.common.base.Function;

public class SimpleBucketed
    extends Bucketed<SimpleBucket>
{
    @Override
    protected SimpleBucket createBucket(SimpleBucket previousBucket)
    {
        return new SimpleBucket();
    }

    public void setBucketedBooleanValue(final boolean bucketedBooleanValue)
    {
        applyToCurrentBucket((Function<SimpleBucket, Void>) input -> {
            input.bucketedBooleanValue = bucketedBooleanValue;
            return null;
        });
    }

    public void setBucketedIntegerValue(final int bucketedIntegerValue)
    {
        applyToCurrentBucket((Function<SimpleBucket, Void>) input -> {
            input.bucketedIntegerValue = bucketedIntegerValue;
            return null;
        });
    }

    public void setNestedBucketBucketedBooleanBoxedValue(final Boolean nestedBucketBucketedBooleanBoxedValue)
    {
        applyToCurrentBucket((Function<SimpleBucket, Void>) input -> {
            input.nestedBucket.bucketedBooleanBoxedValue = nestedBucketBucketedBooleanBoxedValue;
            return null;
        });
    }

    public void setNestedBucketBucketedLongValue(final long nestedBucketBucketedLongValue)
    {
        applyToCurrentBucket((Function<SimpleBucket, Void>) input -> {
            input.nestedBucket.bucketedLongValue = nestedBucketBucketedLongValue;
            return null;
        });
    }

    public void setBucketedBooleanBoxedValue(final Boolean bucketedBooleanBoxedValue)
    {
        applyToCurrentBucket((Function<SimpleBucket, Void>) input -> {
            input.flattenBucket.bucketedBooleanBoxedValue = bucketedBooleanBoxedValue;
            return null;
        });
    }

    public void setBucketedLongValue(final long bucketedLongValue)
    {
        applyToCurrentBucket((Function<SimpleBucket, Void>) input -> {
            input.flattenBucket.bucketedLongValue = bucketedLongValue;
            return null;
        });
    }
}
