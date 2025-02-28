// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.apache.doris.catalog;

import org.apache.doris.nereids.trees.expressions.functions.table.Backends;
import org.apache.doris.nereids.trees.expressions.functions.table.Catalogs;
import org.apache.doris.nereids.trees.expressions.functions.table.Frontends;
import org.apache.doris.nereids.trees.expressions.functions.table.FrontendsDisks;
import org.apache.doris.nereids.trees.expressions.functions.table.GroupCommit;
import org.apache.doris.nereids.trees.expressions.functions.table.Hdfs;
import org.apache.doris.nereids.trees.expressions.functions.table.IcebergMeta;
import org.apache.doris.nereids.trees.expressions.functions.table.Local;
import org.apache.doris.nereids.trees.expressions.functions.table.Numbers;
import org.apache.doris.nereids.trees.expressions.functions.table.Queries;
import org.apache.doris.nereids.trees.expressions.functions.table.S3;
import org.apache.doris.nereids.trees.expressions.functions.table.WorkloadGroups;

import com.google.common.collect.ImmutableList;

/**
 * Builtin table valued functions.
 *
 * Note: Please ensure that this class only has some lists and no procedural code.
 *       It helps to be clear and concise.
 */
public class BuiltinTableValuedFunctions implements FunctionHelper {
    public final ImmutableList<TableValuedFunc> tableValuedFunctions = ImmutableList.of(
            tableValued(Backends.class, "backends"),
            tableValued(Catalogs.class, "catalogs"),
            tableValued(Frontends.class, "frontends"),
            tableValued(FrontendsDisks.class, "frontends_disks"),
            tableValued(GroupCommit.class, "group_commit"),
            tableValued(Local.class, "local"),
            tableValued(IcebergMeta.class, "iceberg_meta"),
            tableValued(Hdfs.class, "hdfs"),
            tableValued(Numbers.class, "numbers"),
            tableValued(Queries.class, "queries"),
            tableValued(S3.class, "s3"),
            tableValued(WorkloadGroups.class, "workload_groups")
    );

    public static final BuiltinTableValuedFunctions INSTANCE = new BuiltinTableValuedFunctions();

    // Note: Do not add any code here!
    private BuiltinTableValuedFunctions() {}
}

