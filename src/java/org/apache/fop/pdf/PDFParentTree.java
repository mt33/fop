/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* $Id: PDFParentTree.java 830293 2009-10-27 19:07:52Z vhennebert $ */

package org.apache.fop.pdf;

/**
 * Class representing a PDF /ParentTree.
 */
public class PDFParentTree extends PDFNumberTreeNode {

    /**
     * Returns the number tree corresponding to this parent tree.
     *
     * @return the number tree
     */
    public PDFNumsArray getNums() {
        PDFNumsArray nums = super.getNums();
        if (nums == null) {
            nums = new PDFNumsArray(this);
            setNums(nums);
        }
        return nums;
    }
}




