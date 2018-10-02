<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

/**
 * @property int $deporteid
 * @property string $nombre
 * @property Divisione[] $divisiones
 */
class deportes extends Model
{
    /**
     * The primary key for the model.
     * 
     * @var string
     */
    protected $primaryKey = 'deporteid';

    /**
     * @var array
     */
    protected $fillable = ['nombre'];

    /**
     * @return \Illuminate\Database\Eloquent\Relations\HasMany
     */
    public function divisiones()
    {
        return $this->hasMany('App\Divisione', 'deporteid', 'deporteid');
    }
}
