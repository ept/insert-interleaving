/**
 *   This file is part of ReplicationBenchmark.
 *
 *   ReplicationBenchmark is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   ReplicationBenchmark is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with ReplicationBenchmark.  If not, see <http://www.gnu.org/licenses/>.
 *
 **/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jbenchmarker.woot.original;

import jbenchmarker.woot.WootIdentifier;
import jbenchmarker.woot.WootNode;

/**
 *
 * @author urso
 */
public class WootOriginalNode extends WootNode {
    private WootOriginalNode cp; // previous node
    private WootOriginalNode cn; // next node
    
    public static final WootOriginalNode CB = new WootOriginalNode(WootIdentifier.IB, null, null, ' ', false);
    public static final WootOriginalNode CE = new WootOriginalNode(WootIdentifier.IE, null, null, ' ', false);

    public WootOriginalNode(WootIdentifier id, WootOriginalNode cp, WootOriginalNode cn, char content, boolean visible) {
        super(id, content, visible);
        this.cp = cp;
        this.cn = cn;
    }

    public WootNode getCn() {
        return cn;
    }

    public WootNode getCp() {
        return cp;
    }
}
