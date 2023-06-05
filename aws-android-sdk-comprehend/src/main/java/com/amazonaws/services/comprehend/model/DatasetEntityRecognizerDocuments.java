/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the documents submitted with a dataset for an entity recognizer
 * model.
 * </p>
 */
public class DatasetEntityRecognizerDocuments implements Serializable {
    /**
     * <p>
     * Specifies the Amazon S3 location where the documents for the dataset are
     * located.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     */
    private String s3Uri;

    /**
     * <p>
     * Specifies how the text in an input file should be processed. This is
     * optional, and the default is ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each
     * file is considered a separate document. Use this option when you are
     * processing large documents, such as newspaper articles or scientific
     * papers. ONE_DOC_PER_LINE - Each line in a file is considered a separate
     * document. Use this option when you are processing many short documents,
     * such as text messages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_DOC_PER_FILE, ONE_DOC_PER_LINE
     */
    private String inputFormat;

    /**
     * <p>
     * Specifies the Amazon S3 location where the documents for the dataset are
     * located.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @return <p>
     *         Specifies the Amazon S3 location where the documents for the
     *         dataset are located.
     *         </p>
     */
    public String getS3Uri() {
        return s3Uri;
    }

    /**
     * <p>
     * Specifies the Amazon S3 location where the documents for the dataset are
     * located.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param s3Uri <p>
     *            Specifies the Amazon S3 location where the documents for the
     *            dataset are located.
     *            </p>
     */
    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * Specifies the Amazon S3 location where the documents for the dataset are
     * located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param s3Uri <p>
     *            Specifies the Amazon S3 location where the documents for the
     *            dataset are located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetEntityRecognizerDocuments withS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
        return this;
    }

    /**
     * <p>
     * Specifies how the text in an input file should be processed. This is
     * optional, and the default is ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each
     * file is considered a separate document. Use this option when you are
     * processing large documents, such as newspaper articles or scientific
     * papers. ONE_DOC_PER_LINE - Each line in a file is considered a separate
     * document. Use this option when you are processing many short documents,
     * such as text messages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_DOC_PER_FILE, ONE_DOC_PER_LINE
     *
     * @return <p>
     *         Specifies how the text in an input file should be processed. This
     *         is optional, and the default is ONE_DOC_PER_LINE.
     *         ONE_DOC_PER_FILE - Each file is considered a separate document.
     *         Use this option when you are processing large documents, such as
     *         newspaper articles or scientific papers. ONE_DOC_PER_LINE - Each
     *         line in a file is considered a separate document. Use this option
     *         when you are processing many short documents, such as text
     *         messages.
     *         </p>
     * @see InputFormat
     */
    public String getInputFormat() {
        return inputFormat;
    }

    /**
     * <p>
     * Specifies how the text in an input file should be processed. This is
     * optional, and the default is ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each
     * file is considered a separate document. Use this option when you are
     * processing large documents, such as newspaper articles or scientific
     * papers. ONE_DOC_PER_LINE - Each line in a file is considered a separate
     * document. Use this option when you are processing many short documents,
     * such as text messages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_DOC_PER_FILE, ONE_DOC_PER_LINE
     *
     * @param inputFormat <p>
     *            Specifies how the text in an input file should be processed.
     *            This is optional, and the default is ONE_DOC_PER_LINE.
     *            ONE_DOC_PER_FILE - Each file is considered a separate
     *            document. Use this option when you are processing large
     *            documents, such as newspaper articles or scientific papers.
     *            ONE_DOC_PER_LINE - Each line in a file is considered a
     *            separate document. Use this option when you are processing
     *            many short documents, such as text messages.
     *            </p>
     * @see InputFormat
     */
    public void setInputFormat(String inputFormat) {
        this.inputFormat = inputFormat;
    }

    /**
     * <p>
     * Specifies how the text in an input file should be processed. This is
     * optional, and the default is ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each
     * file is considered a separate document. Use this option when you are
     * processing large documents, such as newspaper articles or scientific
     * papers. ONE_DOC_PER_LINE - Each line in a file is considered a separate
     * document. Use this option when you are processing many short documents,
     * such as text messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_DOC_PER_FILE, ONE_DOC_PER_LINE
     *
     * @param inputFormat <p>
     *            Specifies how the text in an input file should be processed.
     *            This is optional, and the default is ONE_DOC_PER_LINE.
     *            ONE_DOC_PER_FILE - Each file is considered a separate
     *            document. Use this option when you are processing large
     *            documents, such as newspaper articles or scientific papers.
     *            ONE_DOC_PER_LINE - Each line in a file is considered a
     *            separate document. Use this option when you are processing
     *            many short documents, such as text messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputFormat
     */
    public DatasetEntityRecognizerDocuments withInputFormat(String inputFormat) {
        this.inputFormat = inputFormat;
        return this;
    }

    /**
     * <p>
     * Specifies how the text in an input file should be processed. This is
     * optional, and the default is ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each
     * file is considered a separate document. Use this option when you are
     * processing large documents, such as newspaper articles or scientific
     * papers. ONE_DOC_PER_LINE - Each line in a file is considered a separate
     * document. Use this option when you are processing many short documents,
     * such as text messages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_DOC_PER_FILE, ONE_DOC_PER_LINE
     *
     * @param inputFormat <p>
     *            Specifies how the text in an input file should be processed.
     *            This is optional, and the default is ONE_DOC_PER_LINE.
     *            ONE_DOC_PER_FILE - Each file is considered a separate
     *            document. Use this option when you are processing large
     *            documents, such as newspaper articles or scientific papers.
     *            ONE_DOC_PER_LINE - Each line in a file is considered a
     *            separate document. Use this option when you are processing
     *            many short documents, such as text messages.
     *            </p>
     * @see InputFormat
     */
    public void setInputFormat(InputFormat inputFormat) {
        this.inputFormat = inputFormat.toString();
    }

    /**
     * <p>
     * Specifies how the text in an input file should be processed. This is
     * optional, and the default is ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each
     * file is considered a separate document. Use this option when you are
     * processing large documents, such as newspaper articles or scientific
     * papers. ONE_DOC_PER_LINE - Each line in a file is considered a separate
     * document. Use this option when you are processing many short documents,
     * such as text messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_DOC_PER_FILE, ONE_DOC_PER_LINE
     *
     * @param inputFormat <p>
     *            Specifies how the text in an input file should be processed.
     *            This is optional, and the default is ONE_DOC_PER_LINE.
     *            ONE_DOC_PER_FILE - Each file is considered a separate
     *            document. Use this option when you are processing large
     *            documents, such as newspaper articles or scientific papers.
     *            ONE_DOC_PER_LINE - Each line in a file is considered a
     *            separate document. Use this option when you are processing
     *            many short documents, such as text messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputFormat
     */
    public DatasetEntityRecognizerDocuments withInputFormat(InputFormat inputFormat) {
        this.inputFormat = inputFormat.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getS3Uri() != null)
            sb.append("S3Uri: " + getS3Uri() + ",");
        if (getInputFormat() != null)
            sb.append("InputFormat: " + getInputFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode
                + ((getInputFormat() == null) ? 0 : getInputFormat().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetEntityRecognizerDocuments == false)
            return false;
        DatasetEntityRecognizerDocuments other = (DatasetEntityRecognizerDocuments) obj;

        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getInputFormat() == null ^ this.getInputFormat() == null)
            return false;
        if (other.getInputFormat() != null
                && other.getInputFormat().equals(this.getInputFormat()) == false)
            return false;
        return true;
    }
}