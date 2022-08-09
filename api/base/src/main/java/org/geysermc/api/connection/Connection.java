/*
 * Copyright (c) 2019-2022 GeyserMC. http://geysermc.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 * @author GeyserMC
 * @link https://github.com/GeyserMC/Geyser
 */

package org.geysermc.api.connection;

import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.common.value.qual.IntRange;

import java.util.UUID;

/**
 * Represents a player connection.
 */
public interface Connection {
    /**
     * Gets the bedrock name of the connection.
     *
     * @return the bedrock name of the connection
     */
    @NonNull
    String bedrockUsername();

    /**
     * Gets the java name of the connection.
     *
     * @return the java name of the connection
     */
    @MonotonicNonNull
    String javaUsername();

    /**
     * Gets the {@link UUID} of the connection.
     *
     * @return the UUID of the connection
     */
    @MonotonicNonNull
    UUID javaUuid();

    /**
     * Gets the XUID of the connection.
     *
     * @return the XUID of the connection
     */
    @NonNull
    String xuid();

    /**
     * Transfer the connection to a server. A Bedrock player can successfully transfer to the same server they are
     * currently playing on.
     *
     * @param address The address of the server
     * @param port The port of the server
     * @return true if the transfer was a success
     */
    boolean transfer(@NonNull String address, @IntRange(from = 0, to = 65535) int port);
}
