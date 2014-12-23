/*
 * Kontalk XMPP Tigase extension
 * Copyright (C) 2014 Kontalk Devteam <devteam@kontalk.org>

 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.kontalk.xmppserver.pgp;


/**
 * A PGP user id.
 * @author Daniele Ricci
 */
public class PGPUserID {

    private final String name;
    private final String comment;
    private final String email;

    public PGPUserID(String name) {
        this(name, null, null);
    }

    public PGPUserID(String name, String email) {
        this(name, email, null);
    }

    public PGPUserID(String name, String comment, String email) {
        this.name = name;
        this.comment = comment;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder(name);

        if (comment != null)
            out.append(" (").append(comment).append(')');

        if (email != null)
            out.append(" <").append(email).append('>');

        return out.toString();
    }

}
