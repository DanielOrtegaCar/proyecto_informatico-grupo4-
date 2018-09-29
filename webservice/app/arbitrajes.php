<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

/**
 * @property int $partidoid
 * @property int $arbitroid
 * @property string $tipo
 * @property Arbitro $arbitro
 * @property Partido $partido
 */
class arbitrajes extends Model
{
    /**
     * @var array
     */
    protected $fillable = ['tipo'];

    /**
     * @return \Illuminate\Database\Eloquent\Relations\BelongsTo
     */
    public function arbitro()
    {
        return $this->belongsTo('App\Arbitro', 'arbitroid', 'arbitroid');
    }

    /**
     * @return \Illuminate\Database\Eloquent\Relations\BelongsTo
     */
    public function partido()
    {
        return $this->belongsTo('App\Partido', 'partidoid', 'partidoid');
    }
}
