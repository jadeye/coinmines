/*
 *  Copyright (c) 2011, Franz Bettag <franz@bett.ag>
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * All advertising materials mentioning features or use of this software
 *       must display the following acknowledgement:
 *       This product includes software developed by the Bettag Systems UG
 *       and its contributors.
 *
 *  THIS SOFTWARE IS PROVIDED BY BETTAG SYSTEMS UG ''AS IS'' AND ANY
 *  EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 *  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 *  DISCLAIMED. IN NO EVENT SHALL BETTAG SYSTEMS UG BE LIABLE FOR ANY
 *  DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 *  (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 *  LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 *  ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */

package code
package model

import net.liftweb.mapper._
import net.liftweb.util._
import net.liftweb.common._
import java.util.Date

object Share extends Share with LongKeyedMetaMapper[Share] {
	override def dbTableName = "shares"
}

class Share extends LongKeyedMapper[Share] with IdPK {
	def getSingleton = Share

	object username extends MappedString(this, 255) {
		override def dbIndexed_? = true
		override def dbNotNull_? = true
	}

	object remoteHost extends MappedString(this, 255) {
		override def dbColumnName = "rem_host"
		override def dbNotNull_? = true
	}

	object ourResult extends MappedBoolean(this) {
		override def dbColumnName = "our_result"
		override def dbNotNull_? = true
		override def defaultValue = false
	}

	object upstreamResult extends MappedBoolean(this) {
		override def dbColumnName = "upstream_result"
		//override def dbNotNull_? = true
		//override def defaultValue = false
	}

	object reason extends MappedString(this, 255) {
//		override def dbNotNull_? = true
	}

	object solution extends MappedString(this, 1024) {
//		override def dbNotNull_? = true
	}

	object timestamp extends MappedDateTime(this) {
		override def dbNotNull_? = true
	}

	object source extends MappedString(this, 255) {
//		override def dbNotNull_? = true
	}

	object network extends MappedString(this, 20) {
		override def dbNotNull_? = true
		override def dbIndexed_? = true
	}


}
