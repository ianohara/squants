/*                                                                      *\
** Squants                                                              **
**                                                                      **
** Scala Quantities and Units of Measure Library and DSL                **
** (c) 2013-2014, Gary Keorkunian                                       **
**                                                                      **
\*                                                                      */

package squants.photo

import org.scalatest.{ Matchers, FlatSpec }
import scala.language.postfixOps
import squants.space.SquareMeters
import squants.time.Seconds

/**
 * @author  garyKeorkunian
 * @since   0.1
 *
 */
class LuminousExposureSpec extends FlatSpec with Matchers {

  behavior of "LuminousExposure and its Units of Measure"

  it should "create values using UOM factories" in {
    assert(LuxSeconds(1).toLuxSeconds == 1)
  }

  it should "properly convert to all supported Units of Measure" in {
    val x = LuxSeconds(1)
    assert(x.toLuxSeconds == 1)
  }

  it should "return properly formatted strings for all supported Units of Measure" in {
    assert(LuxSeconds(1).toString(LuxSeconds) == "1.0 lx⋅s")
  }

  it should "return Illuminance when divided by Time" in {
    assert(LuxSeconds(1) / Seconds(1) == Lux(1))
  }

  it should "return Time when divided by Illuminance" in {
    assert(LuxSeconds(1) / Lux(1) == Seconds(1))
  }

  behavior of "LuminousExposureConversions"

  it should "provide aliases for single unit values" ignore {
  }

  it should "provide implicit conversion from Double" ignore {
  }
}
