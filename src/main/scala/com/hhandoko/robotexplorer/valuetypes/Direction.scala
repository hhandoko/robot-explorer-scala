/**
 * File     : Direction.scala
 * Author   : Herdy Handoko
 * Created  : 2015/06/01
 * License  :
 *   Copyright (c) 2015 Herdy Handoko
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.hhandoko.robotexplorer.valuetypes

import enumeratum._

/**
 * The robot's compass direction.
 */
sealed trait Direction extends EnumEntry {
  def heading: Int
  def name: String
}

/**
 * The direction's enumeration.
 */
case object Direction extends Enum[Direction] {

  val values = findValues

  case object N extends Direction { def heading = 0; def name = "North" }
  case object E extends Direction { def heading = 90; def name = "East" }
  case object S extends Direction { def heading = 180; def name = "South" }
  case object W extends Direction { def heading = 270; def name = "West" }

}
